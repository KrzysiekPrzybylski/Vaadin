package com.przybylski.vaadindemo.gui;


import com.przybylski.vaadindemo.menager.CarManager;
import com.przybylski.vaadindemo.model.Car;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

@Route("show-car")
public class CarShowGui extends VerticalLayout {

    private CarManager carManager;

    @Autowired
    public CarShowGui(CarManager carManager) {
        this.carManager = carManager;
        TextField textField = new TextField("Zbiór Aut");

        Grid<Car> grid = new Grid<>(Car.class);
        grid.setItems(carManager.getCarList());

//        grid.addColumn(Car::getMark).setHeader("Mark");
//        grid.addColumn(Car::getModel).setHeader("Model");


        add(textField, grid);
        RouterLink routerLink1 = new RouterLink("Przekierowanie", CarAdderGui.class);
        add(routerLink1);
    }
}

//    private CarManager carManager;
//
//    @Autowired
//    public CarShowGui(CarManager carManager) {
//        this.carManager = carManager;
//
//        Grid<Car> grid = new Grid<>(Car.class, true);
//        List <Car> car = carManager.getCarList();
//        grid.setItems(car);
//
//        add(grid);
//
//
////        Grid<Person> grid = new Grid<>(Person.class, false);
////        grid.addColumn(Person::getFirstName).setHeader("First name");
////        grid.addColumn(Person::getLastName).setHeader("Last name");
////        grid.addColumn(Person::getEmail).setHeader("Email");
////        grid.addColumn(Person::getProfession).setHeader("Profession");
////
////        List<Person> people = DataService.getPeople();
////        grid.setItems(people);
//    }
//
//}
