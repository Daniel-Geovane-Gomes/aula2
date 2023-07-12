// var futas = ["Laranja", "Maca"] <---- vetor em JavaScript



package segunda.aula;

public class SegundaAula {

    public static void main(String[] args) {
        
        // TIPOS DADOS
        
        String name = "Daniel Geovane Gomes";
        int anoNasc = 2005;
        double altura = 1.77;
        boolean eProfessor = false;
        char genero = 'M';
        
        
        System.out.println("Olá "+ name +", você tem "+ qualIdade(anoNasc) +" anos");
        
        if(qualIdade(anoNasc) >= 18){
            System.out.println("Você é maior de idade, já pode ser preso!");
        } else {
            System.out.println("Você ainda não pode ser preso, mas pode apanhar!");
        }
        
        // VETORES (HÁ ESSAS DUAS FORMAS DE SE CRIAR UM VETOR EM JAVA)
        
        String[] frutas = new String[5];
        frutas[0] = "Laranja";
        frutas[1] = "Maca";
        
        String[] frutasDois = {"Laranja", "Maca"};
        
        // ESTRUTURAS DE REPETIÇÃO
        
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
        
        for(String fruta: frutas){
            System.out.println(fruta);
        }
        int i = 0;
        while (i < frutas.length){
            System.out.println(frutas[i]);
            i++;
        }
        
        i = 0;
        do{
            System.out.println(frutas[i]);
            i++;
        } while(i < frutas.length);
        
        // CLASSES WRAPPER(INVOLUCRO)
        
        int variavelPrimitiva = 10;
        Integer variavelEnvolucra = 10;
        
        double valorPrimitivo = 2.10;
        Double valorEnvolucro = 2.10;
        
        boolean boolPrimitivo = true;
        Boolean boolEnvolucro = true;
    }
    
    static int qualIdade(int anoNasc){
        
        return 2023 - anoNasc;
        
    }
}
