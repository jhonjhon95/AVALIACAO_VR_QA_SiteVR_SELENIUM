package acessos;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessoVR {
    @Test
    public void  Testeacessosite(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //abrindo o navegador / Avaliador observe onde está seu drive
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.vr.com.br/");//- entre no site www.vr.com.br;
        navegador.findElement(By.xpath("/html/body/header/nav/div[1]/ul/li[3]/a")).click(); // Navegar até́ a seção “Pra Você̂” (/onde-aceita.htm);
        navegador.findElement(By.xpath("//*[@id=\"pra-voce\"]/header/div/div/div[2]/a[1]")).click(); //  -- Clicar no botão “Onde usar meu cartão VR”;
        navegador.findElement(By.id("map")); // Validar que o mapa do Google abriu em tela.
       // navegador.close(); fecha o navegador se correr tudo como esperado
    }
}
