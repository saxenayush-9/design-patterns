package SingletonPatternWithDoubleCheckLocking;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database db1 = Database.dbConnection();
        Database db2 = Database.dbConnection();
    }
}