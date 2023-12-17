package swcs.gof.behavioral.command.filesystem;

import java.io.File;
import java.util.List;

class Client {

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        BatchFileSystemExecutor executor = new BatchFileSystemExecutor(fs);

        List<Command> commands = List.of(
                new CreateCommand(new File("file.tmp")),
                new DeleteCommand(new File("file.tmp")),
                new CreateCommand(new File("secret.txt")),
                new MoveCommand(new File("secret.txt"), new File("topsecret.txt")));

        executor.execute(commands);
    }
}
