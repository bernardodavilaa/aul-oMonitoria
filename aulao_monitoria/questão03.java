/*Fazer uma Lista com três personagens:

'name': 'BB8', 'height': '120', 'mass': '62', 'hair_color': 'none', 'skin_color': 'none', 'eye_color': 'black', 'birth_year': 'unknown', 'gender': 'none', 'homeworld': 'unknown'
'name': 'R2-D2', 'height': '96', 'mass': '32', 'hair_color': 'n/a', 'skin_color': 'white, blue', 'eye_color': 'red', 'birth_year': '33BBY', 'gender': 'n/a', 'homeworld': 'Naboo'
'name': 'Yoda', 'height': '66', 'mass': '17', 'hair_color': 'white', 'skin_color': 'green', 'eye_color': 'brown', 'birth_year': '896BBY', 'gender': 'male', 'homeworld': 'unknown'

BB8 120 unknown
R2-D2 96 33BBY
Yoda 66 896BBY 

removerFIM
inserirFIM ->  'name': 'C-3PO', 'height': '167', 'mass': '75', 'hair_color': 'n/a', 'skin_color': 'gold', 'eye_color': 'yellow', 'birth_year': '112BBY', 'gender': 'n/a', 'homeworld': 'Tatooine'
inserirInicio -> 'name': 'Chewbacca', 'height': '228', 'mass': '112', 'hair_color': 'brown', 'skin_color': 'unknown', 'eye_color': 'blue', 'birth_year': '200BBY', 'gender': 'male', 'homeworld': 'Kashyyyk'
*/

import java.sql.Date;

class questão03 {
    public static void main(String[]args){
        Personagem[] p= new Personagem[10];
        p[0] = new Personagem("BB8", 120, "unknown");
        p[1]= new Personagem("R2-D2", 0, "33BBY");
        p[2]= new Personagem("Yoda", 66, "896BBY");

        /*removerFIM
        inserirFim
        inserirInicio*/

    }
}

class Personagem{
    private String nome;
    private int altura;
    private String AnoNascimento;


    void setNome(String nome){ this.nome=nome;}
    void setAltura(int altura){ this.altura=altura;}
    void setAnoNascimento(String AnoNascimento){ this.AnoNascimento=AnoNascimento;}


    String getNome(){return this.nome;}
    int getAltura(){return this.altura;}
    String getAnoNascimento(){return this.AnoNascimento;}

    Personagem(String nome, int altura, String AnoNascimento){
        setNome(nome);
        setAltura(altura);
        setAnoNascimento(AnoNascimento);
    }

}
