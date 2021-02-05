package swcs.gof.behavioral.command.filesystem;

import java.io.File;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        BatchFileSystemExecuter executer = new BatchFileSystemExecuter(fs);

        List<Command> commands = List.of(
                new CreateCommand(new File("file.tmp")),
                new DeleteCommand(new File("file.tmp")),
                new CreateCommand(new File("secret.txt")),
                new MoveCommand(new File("secret.txt"), new File("topsecret.txt")));

        executer.execute(commands);
    }
}
