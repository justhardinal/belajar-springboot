
package com.hdl.belajar.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardinal
 */

@RestController

public class ProductController {
    @RequestMapping("/halo")
    public String halo(){
        return "Halo Dunia";
    }
    
}
