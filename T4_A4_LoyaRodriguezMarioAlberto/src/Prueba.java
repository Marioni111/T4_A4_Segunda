import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prueba {
	public static void main(String args[])
    {
      BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
      
      String v, w;
      
      try {
        int n;
        System.out.println("Número de nodos: ");
        n = Integer.parseInt(entrada.readLine());
        GrafoMatriz gra = new GrafoMatriz(n);
      
        System.out.println("Lista de " + n + " vertices");
        
        for (int i = 1; i <= n; i++){
        	
        	System.out.println("Ingresa un numero en el vertice: " +i);
        	v = entrada.readLine();
        	gra.nuevoVertice(v);
        }
      
        
        boolean fin = false;
        
        do {
          StringTokenizer r;
          r = new StringTokenizer("fin");
          v = r.nextToken();
          
          if (! v.equalsIgnoreCase("fin")){
            w = r.nextToken();
            gra.nuevoArco(v, w);
            gra.nuevoArco(w, v);  // al ser grafo no dirigido
          }
          else fin = true;
        } while (!fin);
      
        System.out.println("Vertices del grafo");
        Vertice [] vs = new Vertice[n];
        vs = gra.vertices();
        for (int i = 0; i < n; i++)
          System.out.print(vs[i] + " ");
      
      }
      catch(Exception e)
      {
        System.out.println(" Error en la entrada del grafo ");
      }
    }
  }

