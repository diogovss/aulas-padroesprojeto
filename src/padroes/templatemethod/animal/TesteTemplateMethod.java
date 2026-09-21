package padroes.templatemethod.animal;

import java.util.ArrayList;
import java.util.List;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        SerVivo serVivo = new Artropode(91);
        SerVivo serVivo2 = new Cachorro(15);
        SerVivo serVivo3 = new Humano(95);
        SerVivo serVivo4 = new Barata(2);

        List<SerVivo> fauna = new ArrayList<>();
        fauna.add(serVivo);
        fauna.add(serVivo2);
        fauna.add(serVivo3);
        fauna.add(serVivo4);

        for (SerVivo s : fauna) {
            s.inicializar();
            System.out.println();
        }

    }
}
