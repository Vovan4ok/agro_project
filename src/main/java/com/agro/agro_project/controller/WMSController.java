package com.agro.agro_project.controller;

import com.agro.agro_project.domain.*;
import com.agro.agro_project.service.CounterpartyService;
import com.agro.agro_project.service.UnitService;
import com.agro.agro_project.service.WarehouseService;
import com.agro.agro_project.service.WhItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WMSController {
    @Autowired
    CounterpartyService counterpartyService;

    @Autowired
    WarehouseService warehouseService;

    @Autowired
    WhItemService whItemService;

    @Autowired
    UnitService unitService;

    @GetMapping(value="/counterparties")
    public String getCounterparties(HttpServletRequest request) {
        List<Counterparty> counterpartyList = counterpartyService.findAll();
        request.setAttribute("counterparties", counterpartyList);
        return "counterparties";
    }

    @GetMapping(value="/counterparties/{counterparty_id}")
    public String getCounterparty(@PathVariable Short counterparty_id, HttpServletRequest request) {
        Counterparty counterparty = counterpartyService.findById(counterparty_id);
        request.setAttribute("counterparty", counterparty);
        return "counterparty_info";
    }

    @GetMapping(value="/warehouses")
    public String getWarehouses(HttpServletRequest request) {
        List<Warehouse> warehouses = warehouseService.findAll();
        request.setAttribute("warehouses", warehouses);
        return "warehouses";
    }

    @GetMapping(value="/warehouses/{warehouse_id}")
    public String getWarehouse(@PathVariable Short warehouse_id, HttpServletRequest request) {
        Warehouse warehouse = warehouseService.findById(warehouse_id);
        WarehouseRelatedObjectAssignment warehouseAssignment = warehouseService.findAssignmentByWarehouse(warehouse);
        request.setAttribute("warehouse_assignment", warehouseAssignment);
        return "warehouse_info";
    }

    @GetMapping(value="/wh_items")
    public String getWhItems(HttpServletRequest request) {
        List<WhItem> whItems = whItemService.findAll();
        request.setAttribute("wh_items", whItems);
        return "wh_items";
    }

    @GetMapping(value="/wh_items/{wh_item_id}")
    public String getWhItem(@PathVariable Short wh_item_id, HttpServletRequest request) {
        WhItem whItem = whItemService.findById(wh_item_id);
        request.setAttribute("wh_item", whItem);
        return "wh_item_info";
    }

    @GetMapping(value="/units")
    public String getUnits(HttpServletRequest request) {
        List<Unit> units = unitService.findAll();
        request.setAttribute("units", units);
        return "units";
    }
}
