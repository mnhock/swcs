package swcs.gof.behavioral.command.filesystem;

import java.io.File;

public class MoveCommand implements Command {

    private final File source;
    private final File target;

    public MoveCommand(File source, File target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public void execute(FileSystem fs) {
        fs.move(this.source, this.target);
    }
}
