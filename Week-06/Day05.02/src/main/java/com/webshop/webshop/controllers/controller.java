package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class controller {
    List<ShopItem> listOfItems = new ArrayList<>(Arrays.asList(
            new ShopItem("Running shoes", "nike pair of shoes for running", 10000, 3),
            new ShopItem("Printer", "printing on paper", 20000, 0),
            new ShopItem("Coca cola", "drink", 300, 100),
            new ShopItem("T-shirt", "cloth", 3000, 5)
    ));

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("items", listOfItems);
        return "index";
    }

    @GetMapping("/only-available")
    public String available(Model model) {
        List<ShopItem> filteredItems = listOfItems.stream()
                .filter(c -> c.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("items", filteredItems);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapest(Model model) {
        List<ShopItem> cheapest = listOfItems.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("items", cheapest);
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> containsNike = listOfItems.stream()
                .filter(c -> c.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("items", containsNike);
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        OptionalDouble average = listOfItems.stream()
                .mapToInt(ShopItem::getQuantityOfStock)
                .average();
        if (average.isPresent()) {
            model.addAttribute("average", average.getAsDouble());
        }
        return "average";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        List<ShopItem> availableItems = listOfItems.stream()
                .filter(c -> c.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        ShopItem current = new ShopItem(null, null, 0, 0);
        for (ShopItem shopitem : availableItems) {
            if (shopitem.getPrice() > current.getPrice()) {
                current = shopitem;
            }
        }
        model.addAttribute("current", current.getName());
        return "mostExpensive";
    }

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model) {
        if (search.equals("johny")) {
            return "johny";
        } else {
            List<ShopItem> optionalShopItems = listOfItems.stream()
                    .filter(c -> c.getName().toLowerCase().contains(search.toLowerCase()))
                    .collect(Collectors.toList());
            if (optionalShopItems.isEmpty()) {
                List<ShopItem> optionalShopItems2 = listOfItems.stream()
                        .filter(c -> c.getDescription().toLowerCase().contains(search.toLowerCase()))
                        .collect(Collectors.toList());
                model.addAttribute("items", optionalShopItems2);
            } else {
                model.addAttribute("items", optionalShopItems);
            }
            return "index";
        }
    }

    @GetMapping("/advanced-search")
    public String advancedSearchAbove(Integer searchValue, String action, Model model) {
        if (searchValue != null) {
            switch (action) {
                case "below": {
                    List<ShopItem> optionalShopItems = listOfItems.stream()
                            .filter(c -> c.getPrice() < searchValue)
                            .collect(Collectors.toList());
                    model.addAttribute("items", optionalShopItems);
                    break;
                }
                case "above": {
                    List<ShopItem> optionalShopItems = listOfItems.stream()
                            .filter(c -> c.getPrice() > searchValue)
                            .collect(Collectors.toList());
                    model.addAttribute("items", optionalShopItems);
                    break;
                }
                case "exactly": {
                    List<ShopItem> optionalShopItems = listOfItems.stream()
                            .filter(c -> c.getPrice() == searchValue)
                            .collect(Collectors.toList());
                    model.addAttribute("items", optionalShopItems);
                    break;
                }
            }
        }

        return "advancedSearch";
    }

    @GetMapping("/advancedSearch")
    public String advancedSearch(Model model) {
        model.addAttribute("items", listOfItems);
        return "advancedSearch";

    }

    @GetMapping("/johny")
    public String johny() {
        return "johny";
    }
}



