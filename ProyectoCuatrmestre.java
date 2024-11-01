/*
 Cabrera Nicolas Francisco
 */
package proyectocuatrmestre;
import javax.swing.JOptionPane;

/**
Proyecto Cuatrimestral
* Juego adivinanza
 */

/*
Sirve para dar formato HTML+ CSS en los dialogos.
  String message = "<html><h1 style='color:red;'>Hola Mundo!</h1><p>Este es un mensaje con <b>HTML</b> formateado.</p></html>";
   JOptionPane.showMessageDialog(null, message);

*/
//    cadena = JOptionPane.showInputDialog("Ingrese su nombre"); entradad e datos
// JOptionPane.showMessageDialog(null, “El resultado del calculo es: ” + total); sirve para mostrar un mensaje SALIDA
public class ProyectoCuatrmestre {
     private static void java() {
        JOptionPane.showMessageDialog(null, "\nMMMMMMMMMMMMMMMMMMMMMMMWXNMMMMMMMMMMMMMM" +
               "\nMMMMMMMMMMMMMMMMMMMMMMMX0XMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMMMMMMMWXO0WMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMMMMWX0OOKWWWMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMWNKOOOKNNXNWWMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMNKkOKNNX0KXWMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMNOx0NWX0kONMMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMXkONMWKkxkXMMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMN0OXWMNKOxONMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMWKKNWMWN0x0WMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMWNNNWWWWNWMMWX0NMMMMMWNKKNMMMMM"+
               "\nMMMMMMMMNOdxOKXXNNNNNNXXXXKKXWMW0dkNMMMM"+
               "\nMMMMMMMMWNK0OO0000000000000KNWMW0okNMMMM"+
               "\nMMMMMMMMMMXkxOKXXXXXXXXXK0KWMWX0OKNMMMMM"+
               "\nMMMMMMMMMMWK0OOOOOOOOOOOO0KWWNNNWMMMMMMM"+
               "\nMMMMMMMMWWWWXOOKXXXXXXXKXWMMMMMMMMMMMMMM"+
               "\nMMMMWXOkKNWWXOkkxxxxkxkk0NMMMMWNWMMMMMMM"+
               "\nMMMMWOooxO0KXXNNNXXNNXXNXXXK0000XWMMMMMM"+
               "\nMMMMMWNXK0OOOOOO00000000OOOOOO0KXNWMMMMM"+
               "\nMMMMMMMMMMWNXXKKKKK0000000000KXNWMMMMMMM");
        
    }
    public static void main(String[] args) {
       String nombre;
       nombre = JOptionPane.showInputDialog("Ingrese su nombre");
       String img_php[] = {
        "\nMMMMMMMMMWNK0OkkxxxxxxxxkOO0KNWMMMMMMMMM",
        "MMMMMMWX0OkxxxxxxxxxxxxxxxxxxxOKXWMMMMMM",
        "MMMMWKOxxxxxxxxxxxxxxxxxxxxxxxxxxOXWMMMM",
        "MMWXOxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxOXWMM",
        "MWKkxxxxxxxxxxxxk00OkkxxxxxxxxxxxxxxkKWM",
        "WKxxxxxxxxxxxxxxKWWKOkxxxxxxxxxxxxxxxxKW",
        "KkkOOOOOOOOkxxxOXWWX0OOOOOkxxxOOOOOOOO0X",
        "OOXWNNXXNNNNXOk0NWWNXXXNNNNKkOXWNNXXNNNW",
        "k0NWN0kkkOKNWX0KWWXOkkkOXWWXO0WWXOkkkOXW",
        "kKWWKkxxxx0NWXKNWN0xxxxkKWWKOXWWKxxxxxKN",
        "OXWN0xxxkOXWNKKNWXOxxxxONWN00NWNOxxxk0NW",
        "KNWWXKKXXNNX0OXWWKxxxxxKWWXOKWWNXKKXXNNN",
        "WWWXK00K00Okxk0K0OxxxxxOKKOOXWNXK00000OK",
        "MWN0xxxxxxxxxxxxxxxxxxxxxxx0NWNOxxxxxxON",
        "MWXkxxxxxxxxxxxxxxxxxxxxxxx0KK0kxxxxxONM",
        "MMN0xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx0NMM",
        "MMMWXOxxxxxxxxxxxxxxxxxxxxxxxxxxxxOXWMMM",
        "MMMMMWX0kxxxxxxxxxxxxxxxxxxxxxxk0XWMMMMM",
        "MMMMMMMWNK0OkxxxxxxxxxxxxxxkO0XNWMMMMMMM",
        "MMMMMMMMMMWNX0OkkxxxxxxkkO0XWMMMMMMMMMMM"
    };
       
    String img_js[] = {
	"\nKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",
	"KKKKKKKKKKKKKKKKKOkxxkOKKKK0kxddxO0KKKKK",
	"KKKKKKKKKKKKKKKK0l....oKK0d,.    .;o0KKK",
	"KKKKKKKKKKKKKKKK0:   .l00o.  .::'..cOKKK",
	"KKKKKKKKKKKKKKKK0:   .lK0:   :OKOkO0KKKK",
	"KKKKKKKKKKKKKKKK0:   .lKKd'   .;ldOKKKKK",
	"KKKKKKKKKKKKKKKK0:   .lKKKkc'.    .:x0KK",
	"KKKKKKKKKKKKKKKK0:   .lKKKKK0ko:'   'xKK",
	"KKKKKKKKKK0kox0KO;   .lK0xllk0KKk;  .l0K",
	"KKKKKKKKK0l. .,:,.   'xKd'  .,::,.  .xKK",
	"KKKKKKKKKKkc'.   ..:lx0K0x:'.    ..:x0KK",
	"KKKKKKKKKKKK0kxddxO0KKKKKKK0kxddxkO0KKKK",
	"KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK"
	};
        
  
    
    String img_python[] = {
	"\nMMMMMMMMMWKkxdollccccccclox0NMMMMMMMMMMM",
	"MMMMMMMMWKooOK0occcccc::::::xNMMMMMMMMMM",
	"MMMMMMMMWOlo0X0dcccc:::::::;lKWMMMMMMMMM",
	"MMMMMMMMWOlllolcclc::::::::;c0MMMMMMMMMM",
	"MMWNXKKKK0kkkkkxkkdc:::::::;cKWWWWWWMMMM",
	"WKkollllcccccccc:c::::::;;;;c0NXNXXNNWMM",
	"0ocllcccccccccc:::::::;;;;;,c0NXXXXXXNWM",
	"dcllccccccc::::::::;;;;;;;;;oXNXXXXXXXNW",
	"lclccccccc::::::::::::::::lxKNXXXXXXXKXW",
	"ccccccccccoxO000000000000KXNXXXXXXXXKKXW",
	"dccc:::ckNNXXXNNXXXXXXXXXXXXXXXKKKKKKKNW",
	"Ol:c:::c0WXXXNXXXXXXXXXXXXXXKKKKKKKKKXWM",
	"N0oc:::cOWXXXXXXXXXXXXXXKXXKKKKKKKKKXWMM",
	"MWNXK00KNWXXXXXXKXXXNNNNNNNNNNNNNNWWWMMM",
	"MMMMMMMMMNXXXXXXKKKXXXKXXXKKXWMMMMMMMMMM",
	"MMMMMMMMWNXXXXXKKKKKKKKXNWXKKNMMMMMMMMMM",
	"MMMMMMMMMWNXKKKKKKKKKKKXNNXKXWMMMMMMMMMM",
	"MMMMMMMMMMWNNXXKKKKKKKKKKXNNWMMMMMMMMMMM",
	"MMMMMMMMMMMMMWWWNNNNNNNWWWMMMMMMMMMMMMMM",
	"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
	"MMMMMMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMMMMMM"
	};
    
    String ganaste[] = {
	"\n #####     #    #     #    #     #####  ####### ###### # ###",
	"#     #   # #   ##    #   # #   #     #    #    #        ###",
	"#        #   #  # #   #  #   #  #          #    #        ###",
	"#  #### #     # #  #  # #     #  #####     #    #####     # ",
	"#     # ####### #   # # #######       #    #    #          ",
	"#     # #     # #    ## #     # #     #    #    #        ###",
	" #####  #     # #     # #     #  #####     #    #######  ###"
	};
    
    
       
	
    int opcion_menu;
    boolean validador = true;
       JOptionPane.showMessageDialog(null,"<html><h1 style='color:red;'>Bienvenido!</h1></html>"+"\n" + nombre);
       //JOptionPane.showMessageDialog(null,"Menu Juego" + "\n1. Insturcciones" + "\n2. JUGAR" + "\n3. Salir" + "\n" + "\nPor favor ingrese una opción del [1-3]: ");
       opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("Menu Juego" + "\n1. Insturcciones" + "\n2. JUGAR" + "\n3. Salir" + "\n" + "\nPor favor ingrese una opción del [1-3]: "));
       
       
        do {            
            switch(opcion_menu){
                case 1:
                    opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("INSTRUCCIONES" + "\n"+"1. Deberas adivinar la imagen presentada, eligiendo la opcion que creas correcta, si acertas sumas 1 punto." + 
                            "\n2. Ganaras el juego si logras realizar 4 aciertos con éxito. ¡Mucha suerte!" +
                            "\n"+"\n¿Estas preparado para JUGAR?"+
                            "\n1. JUGAR" + 
                            "\n0. Salir del juego"+
                            "\nElige la opción deseada: "));
                    
                    if (opcion_menu == 1){
	    		opcion_menu = 2;
			} else if (opcion_menu == 0) {
				opcion_menu = 3;
			} else{
				opcion_menu = 9;
			};
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"<html><h1 style='color:green;'>¡A JUGAR!</h1></html>");
                    validador = false;
                break;
                case 3:
                    //gracias por jugar
                 break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción que elegiste no es correcta. Vuelve a intentarlo...");
                    opcion_menu = 1;
                 break;
            }
        } while (validador);
       
       
       //COMIENZO DEL JUEGO
       int contador_juego = 0;
       int opcion_juego_elegida = 0;
       
       /*for(String i: img_java){
           JOptionPane.showMessageDialog(null,"\n" + i);
       }*/
       /*for(int i = 0; i<img_java.length; i++){
           System.out.println(img_java[i]);
       }*/
       
       /*JOptionPane.showMessageDialog(null, "\nMMMMMMMMMMMMMMMMMMMMMMMWXNMMMMMMMMMMMMMM" +
               "\nMMMMMMMMMMMMMMMMMMMMMMMX0XMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMMMMMMMWXO0WMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMMMMWX0OOKWWWMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMMWNKOOOKNNXNWWMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMNKkOKNNX0KXWMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMNOx0NWX0kONMMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMXkONMWKkxkXMMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMN0OXWMNKOxONMMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMMMMMMWKKNWMWN0x0WMMMMMMMMMMMMMM"+
               "\nMMMMMMMMMWNNNWWWWNWMMWX0NMMMMMWNKKNMMMMM"+
               "\nMMMMMMMMNOdxOKXXNNNNNNXXXXKKXWMW0dkNMMMM"+
               "\nMMMMMMMMWNK0OO0000000000000KNWMW0okNMMMM"+
               "\nMMMMMMMMMMXkxOKXXXXXXXXXK0KWMWX0OKNMMMMM"+
               "\nMMMMMMMMMMWK0OOOOOOOOOOOO0KWWNNNWMMMMMMM"+
               "\nMMMMMMMMWWWWXOOKXXXXXXXKXWMMMMMMMMMMMMMM"+
               "\nMMMMWXOkKNWWXOkkxxxxkxkk0NMMMMWNWMMMMMMM"+
               "\nMMMMWOooxO0KXXNNNXXNNXXNXXXK0000XWMMMMMM"+
               "\nMMMMMWNXK0OOOOOO00000000OOOOOO0KXNWMMMMM"+
               "\nMMMMMMMMMMWNXXKKKKK0000000000KXNWMMMMMMM");*/
               java();
    }
    
   
    
}
