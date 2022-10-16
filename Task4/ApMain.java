package multithread;

import java.util.*;

public class ApMain {

    AccountProvider accountProvider;
    private String id;
    private String name;
    private String position;


    public String getId() {
        return accountProvider.Id;
    }

    public void setId(String id) {
        this.id = id;
        accountProvider.Id = this.id;
    }

    public String getName() {
        return accountProvider.Name;
    }

    public void setName(String name) {
        this.name = name;
        accountProvider.Name = this.name;
    }

    public String getPosition() {
        return accountProvider.Position;
    }

    public void setPosition(String position) {
        this.position = position;
        accountProvider.Position = this.position;
    }

    public ApMain(String id, String name, String position) {
        this.accountProvider = new AccountProvider();
        setId(id);
        setName(name);
        setPosition(position);
    }

    public boolean isChecked() {
        return true;
    }

    public static List<String> stringArrayList(ApMain... apMains) {
        List<ApMain> list = Arrays.asList(apMains);
        List<String> sortednames = new ArrayList<>();

        Collections.sort(list, Comparator.comparing(o -> o.name));
        for (int i = 0; i < list.size(); i++) {
            sortednames.add(list.get(i).getName());
        }

        return sortednames;
    }


    public static void main(String[] args) {
        AccountProvider accountProvider = new AccountProvider();
        AccountProvider accountProvider1 = new AccountProvider();
        AccountProvider accountProvider2 = new AccountProvider();
        AccountProvider accountProvider3 = new AccountProvider();

        accountProvider.Name = "Aaaa";
        accountProvider1.Name = "BBBB";
        accountProvider2.Name = "CCC";
        accountProvider3.Name = "DDD";

        ApMain apMain = new ApMain("1", "Abc", "11 22");
        ApMain apMain1 = new ApMain("2", "Bcd", "22 33");
        ApMain apMain2 = new ApMain("3", "Def", "33 44");
        ApMain apMain3 = new ApMain("4", "Fgh", "44 55");

        System.out.println(stringArrayList(apMain, apMain1, apMain3));
        System.out.println(apMain.isChecked());

    }


}
