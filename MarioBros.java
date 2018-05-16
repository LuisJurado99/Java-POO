package com.vannie.mbgame;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera; //nuevo
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import java.security.SecureRandom;



public class MarioBros extends Game {
    
        public static final int WIDTH = 800; //Variable para cambiar el ancho
        public static final int HEIGHT = 480; // Cambia altura
        public static final String TITLE = "Hola_paus"; //nombre de la ventana
        SecureRandom aleatoriox = new SecureRandom();
        
        Rectangle bbCaver;
        Rectangle bbCoin;
        Rectangle bbScreen;
        Rectangle bbObs [] = new Rectangle[10];
        
        SpriteBatch batch;
	private BitmapFont font; //dibuja letras
	private OrthographicCamera camera; //creacion de la camara
        private Cavernicola a; //creacion del objeto de la clase cavernicola
        private Music musica; //creacion de la musica
        private Moneda coin; 
        private Sound sonidoCoin;
        private Obstaculos obs[] = new Obstaculos[10];
        private int vida=0;
        public enum EstadoJuego{
            PLAY,MENU
        }
        public EstadoJuego estadoDeJuego;
        public Skin skin;
        public Stage stage;
        //Metodo donde se crean los objetos necesarios para el juego
        //Es lo primero que se ejecuta!
	@Override
	public void create () {
                int x,y,z,w;
                z= (aleatoriox.nextInt(369)+1);
                w= (aleatoriox.nextInt(209)+1);
		batch = new SpriteBatch(); //agrupacion de objetos que se van a dibujar
		
                font = new BitmapFont(); // 
                
                camera = new OrthographicCamera(); //instancia de la camara
                
                camera.setToOrtho(false,400,240); //eje y apunta hacia arriba, ancho, alto
                
                camera.update(); // Actualiza la camara
                                
                a = new Cavernicola(0,0); 
                bbCaver = new Rectangle(a.x,a.y,(a.imagenC.getWidth()/4)-15,(a.imagenC.getHeight()/4)-15);
                
                
                for (int i = 0; i < 10; i++) {
                    x= (aleatoriox.nextInt(369)+1);
                    y= (aleatoriox.nextInt(209)+1);
                    obs[i]= new Obstaculos(x,y);
                    bbObs[i] = new Rectangle(obs[i].x, obs[i].y, obs[i].imagenObs.getWidth(), obs[i].imagenObs.getHeight());
                }
                coin = new Moneda(z,w);
                bbCoin = new Rectangle(coin.x,coin.y,coin.imagenM.getWidth()/6,coin.imagenM.getHeight());
                
                musica = Gdx.audio.newMusic(Gdx.files.getFileHandle("lust.mp3", Files.FileType.Local));
                sonidoCoin = Gdx.audio.newSound(Gdx.files.internal("coin1.wav"));
                estadoDeJuego = EstadoJuego.MENU;
	}
             

	@Override
	public void render () {
                
            // Limpia el bufer
		Gdx.gl.glClearColor(0, 0, 0, 0);
                
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
               switch (estadoDeJuego) {
                
                   case MENU: 
                       stage = new Stage();
                       
                       //Se crea, se le pone tamaño y posicion
                       Table tabla = new Table();
                       tabla.setPosition(1024/3,450);
                       tabla.setFillParent(true);
                       tabla.setHeight(500);
                       stage.addActor(tabla);
                       
                        //Etiqueta de texto
                       Label etiqueta = new Label("Bienvenido a Caveman", getSkin());
                       etiqueta.setPosition(300, 400);
                       stage.addActor(etiqueta);
                       //boton de play
                       TextButton botonplay = new TextButton("Jugar", getSkin());
                       botonplay.setPosition(300, 300);
                       botonplay.setHeight(40);
                       botonplay.setWidth(200);
                       botonplay.addListener(new InputListener(){
                           @Override
                           public boolean touchDown(InputEvent event, float x, float y, int puntero, int boton ){
                               estadoDeJuego = EstadoJuego.PLAY;
                               
                               return false;
                           }
                       });
                       stage.addActor(botonplay);
                       //boton de salir
                       TextButton botonsalir = new TextButton("Salir", getSkin());
                       botonsalir.setPosition(300,200);
                       botonsalir.setHeight(40);
                       botonsalir.setWidth(200);
                       botonsalir.addListener(new InputListener(){
                           @Override
                           public boolean touchDown(InputEvent event, float x, float y, int puntero, int boton ){
                               System.exit(0);
                               return false;
                           }
                       });
                       stage.addActor(botonsalir);
                       //Pintando el menu
                       stage.act(Gdx.graphics.getDeltaTime());
                       stage.draw();
                       Gdx.input.setInputProcessor(stage);
                       break;
                   
                   case PLAY:
                    if (Gdx.input.isKeyPressed(Input.Keys.Z)) {
                        musica.setLooping(true);
                        musica.play();
                    }

                    if (Gdx.input.isKeyPressed(Input.Keys.X)) {
                        musica.pause();
                    }

                    camera.update(); //Para que este actualizando
                    batch.setProjectionMatrix(camera.combined); //El batch utliza la camara

                    batch.begin(); //INICIALIZA EL BATCH

                    //DIBUJA        
                    //font.draw(batch, "Where is my money bitch?", 300,100);
                    a.render(batch);
                    coin.render(batch);

                    for (int i = 0; i < 10; i++) {
                        obs[i].render(batch);
                    }

                    batch.end(); //Finaliza 
                    moverCaver();
                    break;
                
            }
                
	}
        protected Skin getSkin(){
            if(skin == null){
                skin = new Skin(Gdx.files.internal("uiskin.json"));
            }
            return skin;
        }
        public void moverCaver(){
            moverTeclado();
            recalcularBloque();
            if(bbCaver.overlaps(bbCoin)){
               moverMoneda();
            }
            chequeoDeColisionConObstaculos();
            
        }
        
        
        public void moverMoneda(){
            int x = (aleatoriox.nextInt(369)+1);
            int y = (aleatoriox.nextInt(209)+1);
            sonidoCoin.play(1);
            bbCoin.x = x;
            coin.x = x;
            bbCoin.y = y;
            coin.y = y;
            vida+=1;
           // puntaje++;
        }
        public void recalcularBloque(){
             bbCaver.setX(a.x);
             bbCaver.setY(a.y);
        }
        public void chequeoDeColisionConObstaculos(){
            for (int i = 0; i < 10; i++) {
                if (bbCaver.overlaps(bbObs[i])) {
                    vida-=10;
                }
            }
            
        }
        
        public void moverTeclado(){
            if(a.y<=210){
                if(Gdx.input.isKeyPressed(Input.Keys.UP)){
                    a.y+=1;          
                }
                if ((Gdx.input.isKeyPressed(Input.Keys.SPACE)) && (Gdx.input.isKeyPressed(Input.Keys.UP)) ) {
                    a.y+=2;
                }
            }
            if (a.y>=0) {
                if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
                    a.y-=1;
                }
                if ((Gdx.input.isKeyPressed(Input.Keys.SPACE)) && (Gdx.input.isKeyPressed(Input.Keys.DOWN)) ) {
                    a.y-=2;
                }
            }
            if(a.x>=0){
                if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                    a.x-=1;
                }
                if ((Gdx.input.isKeyPressed(Input.Keys.SPACE)) && (Gdx.input.isKeyPressed(Input.Keys.LEFT)) ) {
                    a.x-=2;
                }
            }
            if(a.x<=370){
                if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                    a.x+=1;    
                }
                if ((Gdx.input.isKeyPressed(Input.Keys.SPACE)) && (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) ) {
                    a.x+=2;
                }
            }
        }
        
	@Override
	public void dispose () {
                 
                //batch.dispose();
		//img.dispose();
	}
}
