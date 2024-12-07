package com.klu.EXP3LMS;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="items")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  // Using SINGLE_TABLE strategy for Table per Class Hierarchy
@DiscriminatorColumn(name="item_type", discriminatorType = DiscriminatorType.STRING)  // Discriminator column to distinguish subclasses
@DiscriminatorValue("item")  // Discriminator value for Item base class
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    @Column(name="title")
    private String title;

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
