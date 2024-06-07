package com.tobeto.hotel_booking_java4a_pair5.services.mappers;


import com.tobeto.hotel_booking_java4a_pair5.entities.District;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.requests.district.AddDistrictRequest;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.requests.district.UpdateDistrictRequest;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.responses.district.GetAllDistrictResponse;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.responses.district.GetByIdDistrictResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DistrictMapper {
    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

    @Mapping(target = "city.id", source = "cityId")
    District districtFromAddRequest(AddDistrictRequest request);

    @Mapping(target = "city.id", source = "cityId")
    District districtFromUpdateRequest(UpdateDistrictRequest request);

    @Mapping(target = "cityName", source = "city.name")
    GetAllDistrictResponse getAllDistrictResponseMap(District district);

    List<GetAllDistrictResponse> getAllDistrictResponseList(List<District> districts);

    @Mapping(target = "cityName", source = "city.name")
    GetByIdDistrictResponse getByIdDistrictResponse(District district);
}
