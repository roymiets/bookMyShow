package com.bootninza.movieticketbooking.request;

import com.bootninza.movieticketbooking.entity.Theatre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddTheatreRequest {

   private Long cityId;
   private TheatreDao theatre;

}
