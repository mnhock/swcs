package swcs.dp.dip.logger.before;

class Logger {
    private final FileSystem fileSystem;

    Logger() {
        this.fileSystem = new FileSystem();
    }

    public void log(String message) {
        this.fileSystem.log(message);
    }
}
