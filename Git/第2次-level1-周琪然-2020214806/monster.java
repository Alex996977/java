import java.util.Scanner;

public class monster {
    String name;
    String hp;
    String atk;
    String def;
    public void tell() {
        System.out.println("名称：" + name + "\n" + "生命值" + hp + "\n" + "攻击力" + atk);
    }
    public static void main(String[] args) {
        monster B = new monster();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入怪物昵称");
        B.name = sc.nextLine();
        System.out.println("请输入怪物生命值");
        B.hp = sc.nextLine();
        System.out.println("请输入怪物攻击力");
        B.atk = sc.nextLine();
    }
}
