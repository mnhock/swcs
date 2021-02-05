package swcs.gof.behavioral.command.filesystem;

import java.util.List;

public class BatchFileSystemExecuter {

    private final FileSystem fs;

    public BatchFileSystemExecuter(FileSystem fs) {
        this.fs = fs;
    }

    public void execute(List<Command> commands) {
        commands.forEach(c -> c.execute(this.fs));
    }
}
