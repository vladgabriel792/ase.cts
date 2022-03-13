package eu.ase.acs.solid.i;

public class CannonUltraPerform implements IPrintTasks{
    @Override
    public boolean scan(String content) {
        return false;
    }

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
    public boolean badgeAuthentication(String content) {
        return false;
    }

    @Override
    public boolean fax(String content, String number) {
        return false;
    }
}
