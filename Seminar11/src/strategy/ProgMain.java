package strategy;

public class ProgMain {
    public static void main(String[] args) {

        int [] val = new int[10];
        for (int i = 0; i< 10; i++)
        {
            if(i%2 == 0)
            {
                val[i] = -i * 2+3;
            }
            else {
                val[i] = i*3+1;
            }
        }
        for (int nr : val)
        {
            System.out.println(nr);
        }
//        DataContext context = new DataContext(val,new StrategyDetMax());
        DataContext context = new DataContext(val,new StrategyDetMin());
        int value = context.processValue();
        System.out.println("\n" + value);
    }
}
