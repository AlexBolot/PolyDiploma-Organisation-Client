package fr.polytech.polydiploma.remote.cli.framework;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Shell<T> {

    public T system;
    protected String invite;
    private Map<String, Class<? extends Command<T>>> commands = new HashMap<>();
    private static final String HELP_SYMBOL = "help";

    public final void run() {
        System.out.println("Le shell interactif est lancé. Tapez " + HELP_SYMBOL + " pour de l'aide.\n");
        run(System.in, false, 0);
    }

    public void run(InputStream stream, boolean shouldEcho, int indent) {
        Scanner scanner = new Scanner(stream);
        boolean shouldContinue = true;

        while (shouldContinue) {

            System.out.flush();

            for (int i = 0; i < indent; i++) {
                System.out.print(" ");
            }

            System.out.print(invite + " > ");

            if (!scanner.hasNext()) {
                System.out.println("Fin du fichier atteint");
                break;
            }

            String keyword = scanner.next().trim();

            String rawArgs = "";
            List<String> args = new LinkedList<>();

            if (scanner.hasNextLine()) {
                rawArgs = scanner.nextLine();
                args = Arrays.stream(rawArgs.split(" ")).filter(s -> !s.isEmpty()).collect(Collectors.toList());
            }

            if (shouldEcho) System.out.println(keyword + " " + rawArgs);

            if (keyword.equals(HELP_SYMBOL)) {
                help();
            } else {
                try {
                    if (!keyword.isEmpty() && !keyword.startsWith("#"))
                        shouldContinue = processCommand(keyword, args);

                } catch (IllegalArgumentException iae) {
                    System.err.println("Mauvais paramétres pour la commande " + keyword + ": " + args);
                } catch (Exception e) {
                    System.err.println("Exception caught while processing command:\n  " + e);
                }
            }
        }
    }

    private boolean processCommand(String keyword, List<String> args) throws Exception {
        if (!commands.containsKey(keyword)) {
            System.out.println("Commande inconnue: " + keyword);
            return true;
        }

        Class<? extends Command<T>> command = commands.get(keyword);
        try {
            Command inst = command.newInstance();
            inst.withShell(this);
            return inst.process(args);

        } catch (InstantiationException | IllegalAccessException e) {
            System.err.println("Impossible d'éxecuter la commande " + command.toString());
            e.printStackTrace();
            return true;
        }
    }

    @SafeVarargs
    public final void register(Class<? extends Command<T>>... commands) {
        Arrays.stream(commands).forEach(this::registerCommand);
    }


    private Collection<Class<? extends Command<T>>> instructions() {
        return commands.values();
    }

    private void registerCommand(Class<? extends Command<T>> command) {
        try {
            String identifier = command.newInstance().identifier();
            if (identifier.contains(" "))
                throw new IllegalArgumentException("Les identificateur ne peuvent pas contenir d'espace");
            commands.put(identifier, command);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException e) {
            System.err.println("Impossible d'enregistrer la commande " + command.toString());
            e.printStackTrace();
        }
    }

    private void help() {
        List<Class<? extends Command>> commands = new ArrayList<>(instructions());

        commands.sort((class1, class2) -> {

            try {
                Command c1 = class1.newInstance();
                Command c2 = class2.newInstance();

                return c1.identifier().compareToIgnoreCase(c2.identifier());

            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }

            return 0;
        });

        for (Class<? extends Command> c : commands) {
            try {
                Command instance = c.newInstance();
                System.out.println("  - " + instance.identifier() + " : " + instance.describe());
            } catch (InstantiationException | IllegalAccessException e) {
                System.err.println("Impossible d'afficher de l'aide pour la commande : " + c);
                e.printStackTrace();
            }
        }
    }
}
