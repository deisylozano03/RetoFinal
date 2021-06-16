package us.abstracta.opencar.sqa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://opencart.abstracta.us/index.php?route=common/home")
public class PaginaYourStore extends PageObject{

        public static final Target Search_Option= Target.the("Busqueda Mac").located(By.xpath("//*[@id=\"search\"]/input[1]"));
        public static final Target Search_Button= Target.the("Buscar").located(By.xpath("//*[@id=\"search\"]/span[1]/button[1]"));
        public static final Target Mac_Button= Target.the("Mac").located(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]"));
    }

