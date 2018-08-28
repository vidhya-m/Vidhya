package Practice;

/**
 * Created by expert on 7/22/18.
 */
public class EqualsHash {
    String name;
    int id;

    public EqualsHash(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        EqualsHash EqualsHash=(EqualsHash) obj;
        return(EqualsHash.name==this.name && EqualsHash.id==this.id);
        }
        public int hashCode(){
        return this.id;
        }
    public static void main(String[] args) {
        EqualsHash e1=new EqualsHash("XXX",1);
        EqualsHash e2=new EqualsHash("XXX",1);

        if(e1.hashCode()==e2.hashCode()) {
            if (e1.equals(e2))
                System.out.println("Equal objects");
            else
                System.out.println("Unequal objects");
        }
        else
            System.out.println("both objects are not equal;");

            }
        }

