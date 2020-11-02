import java.util.Scanner;
public class character {
        String name;
        String hp;
        String atk;
        String def;
        public void tell() {
            System.out.println("名称：" + name+"\n"+"生命值"+hp+"\n"+"攻击力"+atk+"\n"+"防御力"+def);}
    public static void main(String[] args) {
            character A=new character();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入角色昵称");
        A.name=sc.nextLine();
//        boolean t=A.name.equals("蔡徐坤");
        System.out.println("请输入角色生命值");
        A.hp=sc.nextLine();
        System.out.println("请输入角色攻击力");
        A.atk=sc.nextLine();
        System.out.println("请输入角色防御力");
        A.def=sc.nextLine();


    }




        }



