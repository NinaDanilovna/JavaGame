import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class window extends JFrame//форма
	{
		private JButton buttonStart;
		public int x1[] = {80,80,200,200 };
		public int y1[] = {80,200,200,80 };
		
		public int x2[] = {80,80,200,200};
		public int y2[] = {80,200,200,80};
		
		public window()//конструктор формы
		{
			   
			super("frame");//заголовок
			
			
			this.addKeyListener(new KeyAdapter() //работа с клавишей
					{
					     
					    public void keyPressed(KeyEvent e) 
					    {
					        //Почему то ничего не работает
					    }
					             
					});
			
			buttonStart = new JButton("Старт");//Кнопка начало
			buttonStart.setLocation(0, 0);
			buttonStart.setSize(80, 20);
			buttonStart.setLayout(null);
			
			
			buttonStart.addActionListener(new ActionListener()
			{
				  public void actionPerformed(ActionEvent e)
				  {
					
				  }
				});//кнопка конец
						
			setBounds(50,50, 800,600);//положение и размер окна
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//для кнопки закрыть
			this.setBackground(Color.BLACK);
			add(buttonStart, BorderLayout.AFTER_LAST_LINE);
			
		}
		
		
		 public void paint( Graphics g ) {
		      // change the color and display some text 
			
		      g.setColor( new Color( 255, 255, 255 ) );
		      g.drawString( "Прямоугольник " + x1[0] , 10, 50);
		      g.fillPolygon(x1, y1, 4);
		   }
	
	}
	
