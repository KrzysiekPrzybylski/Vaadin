package com.przybylski.vaadindemo.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import static java.awt.SystemColor.infoText;

@Route("hello")
public class HelloGui extends VerticalLayout {

    private int counter = 0;
    public HelloGui() {
        TextField textField = new TextField();
        textField.setLabel("Name");

        textField.setClearButtonVisible(true);
        textField.setPrefixComponent(VaadinIcon.ACCESSIBILITY.create());

        Button button = new Button("Say Hello", new Icon(VaadinIcon.CHEVRON_LEFT));
        button.setIconAfterText(true);
//        button.addClickListener(clickEvent -> {
//            counter += 1;
//            info.setText(textField.getValue());
//        });


        Dialog dialog = new Dialog();
        dialog.setWidth("400");
        dialog.setHeight("300");

        dialog.setHeaderTitle("Welcome");

        button.addClickListener(event -> {
            dialog.add(new Label("Hello  " + textField.getValue()));
            dialog.open();

            }
        );


        add(textField);
        add(button);
    }
}
