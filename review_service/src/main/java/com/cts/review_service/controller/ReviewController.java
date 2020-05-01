package com.cts.review_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.review_service.entity.Rating;
import com.cts.review_service.entity.Reviews;
import com.cts.review_service.service.RatingServiceImplementation;
import com.cts.review_service.service.ReviewServiceImplementation;

@RestController
@CrossOrigin
public class ReviewController {

    @Autowired
    public ReviewServiceImplementation rServ;

    @Autowired
    public RatingServiceImplementation ratServ;

    @RequestMapping(method=RequestMethod.POST,value="/reviews")
	void addReviews(@RequestBody Reviews cat) {
		rServ.addReviews(cat);
    }

    @RequestMapping("products/reviews/{p_id}")
	public ResponseEntity<Reviews> getByProductId(@PathVariable(name = "p_id") int productId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByProductId(productId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("ram/reviews/{rId}")
	public ResponseEntity<Reviews> getByRamId(@PathVariable(name = "rId") int ramId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByRamId(ramId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("camera/reviews/{cId}")
	public ResponseEntity<Reviews> getByCameraId(@PathVariable(name = "cId") int cameraId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByCameraId(cameraId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("display/reviews/{dId}")
	public ResponseEntity<Reviews> getByDisplayId(@PathVariable(name = "dId") int displayId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByDisplayId(displayId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("battery/reviews/{bId}")
	public ResponseEntity<Reviews> getByBatteryId(@PathVariable(name = "bId") int batteryId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByBatteryId(batteryId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("processor/reviews/{prId}")
	public ResponseEntity<Reviews> getByProcessorId(@PathVariable(name = "prId") int processorId) {
		ResponseEntity<Reviews> result;
		Reviews entity = rServ.getByProcessorId(processorId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Reviews>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Reviews>(HttpStatus.NOT_FOUND);
		}
		return result;
	}


    @RequestMapping("/reviews")
	public ResponseEntity<Iterable<Reviews>> findAll() {
		return new ResponseEntity<Iterable<Reviews>>(rServ.findAll(),HttpStatus.OK);
	}

    
    @RequestMapping(method=RequestMethod.POST,value="/ratings")
	void addRating(@RequestBody Rating rat) {
		ratServ.addRatings(rat);
    }
    
    @RequestMapping("/ratings")
	public ResponseEntity<Iterable<Rating>> findAll1() {
		return new ResponseEntity<Iterable<Rating>>(ratServ.findAll(),HttpStatus.OK);
    }
    
    @RequestMapping("product/ratings/{pId}")
	public ResponseEntity<Rating> getByProductId1(@PathVariable(name = "pId") int productId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByProductId(productId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("ram/ratings/{rId}")
	public ResponseEntity<Rating> getByRamId1(@PathVariable(name = "rId") int ramId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByRamId(ramId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("camera/ratings/{cId}")
	public ResponseEntity<Rating> getByCameraId1(@PathVariable(name = "cId") int cameraId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByCameraId(cameraId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("display/ratings/{dId}")
	public ResponseEntity<Rating> getByDisplayId1(@PathVariable(name = "dId") int displayId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByDisplayId(displayId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("battery/ratings/{bId}")
	public ResponseEntity<Rating> getByBatteryId1(@PathVariable(name = "bId") int batteryId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByBatteryId(batteryId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
    
    @RequestMapping("processor/ratings/{prId}")
	public ResponseEntity<Rating> getByProcessorId1(@PathVariable(name = "prId") int processorId) {
		ResponseEntity<Rating> result;
		Rating entity = ratServ.getByProcessorId(processorId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Rating>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Rating>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

}