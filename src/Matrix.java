import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;



public class Matrix extends JFrame implements ActionListener{

	
	
	private JButton [][] botones;


	Matrix(int num_fil, int num_col)
	{
		super("Matrix");
		setBounds(200,200,400,400);
		setVisible(true);
		
		
		/**
		JToolBar barra = new JToolBar();
		JLabel etqtaFilas = new JLabel();
		JLabel etqtaColumnas = new JLabel();
		txtFilas = new JTextField();
		txtCols = new JTextField();
		botonCrear = new JButton();
		panel = new JPanel( null );
		
		//Para el cierre de la app
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ponemos la etiqueta y añadimos a nuestra barra
		etqtaFilas.setText("Filas");
		barra.add(etqtaFilas);
		
		etqtaColumnas.setText("Columnas");
		barra.add(etqtaColumnas);
		
		txtFilas.setPreferredSize(new Dimension(50, 25));
		barra.add(txtFilas);
		
		txtCols.setPreferredSize(new Dimension(50, 25));
		barra.add(txtCols);
		
		botonCrear.setText("Crear Tablero");
		botonCrear.addActionListener(this);
		barra.add(botonCrear);
		
		//Colocamos el JToolBar en la parte de arriba del JFrame
		this.add(barra, BorderLayout.PAGE_START);
 
		//Se agrega el panel a boton
        this.add(panel, BorderLayout.CENTER);
 
		this.setSize(410, 330);
		//Permite que la ventana se coloque al centro de la pantalla
		this.setLocationRelativeTo(null);
 
	}
		
		
		public void actionPerformed( ActionEvent evt ) {
			//Se obtiene la cantidad de filas a crear como una cadena de caracter
			String f = txtFilas.getText();
	 
			//Se obtiene la cantidad de columnas a crear como una cadena de caracter
	        String c = txtCols.getText();
	        
	        //Se cambia de cadena de caracteres a numeros
	        int num_fil = Integer.parseInt(f);
	        int num_col = Integer.parseInt(c);
			
			//Eliminamos los anteriores botones
	        panel.removeAll();
	        panel.updateUI();
	       */
		
		Container contentpane = getContentPane();
		//Parámetros GridLayout(num filas, num columnas, hgap(espacio horizontal), vgap(espacio vertical))
		//En este caso utilizamos el otro constructor para evitar espacios entre elementos.
		contentpane.setLayout(new GridLayout(num_fil,num_col));
		
		botones = new JButton[num_fil][num_col];
		
		for(int i = 0; i < num_fil; i ++)
		{
			for(int j = 0; j < num_col; j ++)
			{
				//botones[i][j] = new JButton(new ImageIcon("stone.jpg"));
				//contentpane.add(botones[i][j]);
				botones[i][j] = new JButton();
				botones[i][j].setIcon(new ImageIcon("stone.jpg"));
				botones[i][j].addActionListener(this);
				contentpane.add(botones[i][j]);
			}
		}
		
		
		/*******************************************************
		//Cambiamos en este caso la imagen de determinados iconos 
		for(int i = num_fil - 1; i > 0; i = i-2)
		{
			for( int j = num_col - 1; j > 0; j = j-2)
			{
				botones[i][j].setIcon(new ImageIcon("lava.jpg"));
			}
		}
		*********************************************************/
		
		/**botones[num_fil-1][num_col-1].setIcon(new ImageIcon("lava.jpg"));
		botones[num_fil-2][num_col-2].setIcon(new ImageIcon("lava.jpg"));
		botones[num_fil-3][num_col-3].setIcon(new ImageIcon("lava.jpg"));
		//panel.updateUI();*/
		paintComponents(getGraphics());
		
		
		//Cerramos el constructor
	}
		//Metodo para cambiar la imagen de los iconos.
		//Parametros: posicion fila, posicion columnas.
		public void actionPerformed(ActionEvent evento) {
			JButton button = (JButton) evento.getSource();
			button.setIcon(new ImageIcon("lava.jpg"));
		}
	
	
		void cambiarIcono(int f,int c)
		{
			botones[f-1][c-1].setIcon(new ImageIcon("lava.jpg"));
		}
		
	

	public static void main(String[] args) {
		
		int filas, columnas = 0;
		int f_obs, c_obs = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Numero de FILAS:  ");
		filas = in.nextInt();
		System.out.println("Numero de COLUMNAS:  ");
		columnas = in.nextInt();
		
		System.out.println("Obstaculo:");
		int f = in.nextInt();
		int c = in.nextInt();
		
		
		Matrix ventana = new Matrix(filas, columnas);
		
		ventana.cambiarIcono(f, c);
		//ventana.botones[f_obs][c_obs] = new JButton(new ImageIcon("stone.jpg"));
		//********ventana.botones[f_obs][c_obs].setBackground(null);
		
		//Matrix ventana = new Matrix().setVisible(true);
		//new Matrix().setVisible(true);
	}
	/*
	JButton botonCrear;
	JTextField txtFilas;
	JTextField txtCols;
	JPanel panel;*/
}	
