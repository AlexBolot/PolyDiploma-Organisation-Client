package fr.polytech.polydiploma.remote.cli.framework;

import java.util.List;

public abstract class Command<T> {

    protected Shell<T> shell;

    abstract public String identifier();

    abstract public void execute() throws Exception;

    abstract public String describe();

    // default implementation
    public boolean shouldContinue() {
        return true;
    }

    // default implementation
    public void load(List<String> args) {
    }

    public void withShell(Shell<T> shell) {
        this.shell = shell;
    }

    public boolean process(List<String> args) throws Exception {
        try {
            load(args);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        execute();
        return shouldContinue();
    }

    // ---------------------------------------------------------------//
    // --------------- Utils Methods for all commands --------------- //
    // ---------------------------------------------------------------//

    /**
     * Prints on standard output with a tab in front of it as indentation
     *
     * @param message Message to be printed
     */
    protected void log(String message) {
        System.out.println("\t" + message);
    }

    /**
     * Parses a given [value] into an integer
     *
     * @param value String value to be parsed as integer
     * @return Integer parsed from [value]. OR -1 if [value] is not a number
     */
    protected int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            log("Erreur : " + value + " n'est pas un nombre !");
            return -1;
        }
    }

}
