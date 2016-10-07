package swcs.gof.behavioral.templatemethod;

public class AndroidCompiler extends CrossCompiler {

    @Override
    protected void collectSource() {
        // anything specific to this class
    }

    @Override
    protected void compileToTarget() {
        // android specific compilation
    }
}
