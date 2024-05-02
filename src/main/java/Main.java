import br.fiap.heitor.domain.model.Carro;
import br.fiap.heitor.domain.model.Moto;
import br.fiap.heitor.domain.model.Caminhao;
import br.fiap.heitor.domain.model.Veiculos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculos veiculo = new Veiculos("fiat", "a", 2000, 150);
        Carro carro = new Carro("renault", "sandero", 2020, 0);
        Moto moto = new Moto("honda", "cg 160", 2009, 51);
        Caminhao caminhao = new Caminhao("iveco", "tector", 2024, 50);




        carro.obterStatus();


        //carro.ligar_ar_condicionado();
        //carro.obterStatus();


    }
}