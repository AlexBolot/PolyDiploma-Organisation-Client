package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Field;

import java.util.List;

public class GetFields extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() {
        return "filieres";
    }

    @Override
    public void execute() throws Exception {
        List<Field> fields = shell.system.organisation.getFields();
        for (Field f : fields) {
            System.out.println("    " + f.value());
        }
    }

    @Override
    public String describe() {
        return "Affiche les différentes filières";
    }
}
