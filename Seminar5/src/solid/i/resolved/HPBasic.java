package solid.i.resolved;

public class HPBasic implements IPrintTasks, IPrintScanner, IPrintFromOutside{
    @Override
    public boolean printFromExternalDevice(String content) {
        return false;
    }

    @Override
    public boolean print(String content) {
        return false;
    }

    @Override
    public boolean openClose(boolean state) {
        return false;
    }

    @Override
    public boolean scan(String content) {
        return false;
    }
}
