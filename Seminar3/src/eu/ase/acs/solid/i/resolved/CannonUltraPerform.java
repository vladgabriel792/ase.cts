package eu.ase.acs.solid.i.resolved;

public class CannonUltraPerform implements IPrintTasks, IPrintScanner, IAuthenticator, IFax{
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

    @Override
    public boolean badgeAuthentication(String content) {
        return false;
    }

    @Override
    public boolean fax(String content, String number) {
        return false;
    }
}
