package money.master.views.features;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import money.master.views.main.HomeView;

@Route(value = "features", layout = HomeView.class)
public class Features extends VerticalLayout {
    public Features() {
        add(new H1("App Features"));
        add(new Text("MoneyMaster is a brand-new software that not only helps manage your finances, it sets" +
                " one up for success in the future. Here are some of the basic features: "));

    }
}
