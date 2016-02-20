package utilidades;

import java.util.ArrayList;

public class Sort {
    public static void organizar(ArrayList<Comparavel> v) {
        while(true) {
            boolean houveTroca = false;
            for(int i = 1; i < v.size(); i++) {
                if(v.get(i-1).ehMaior(v.get(i))) {
                    Comparavel tmp = v.get(i);
                    v.set(i, v.get(i-1));
                    v.set(i-1, tmp);
                    houveTroca = true;
                }
            }
            if(!houveTroca)
                break;
        }
    }
}
