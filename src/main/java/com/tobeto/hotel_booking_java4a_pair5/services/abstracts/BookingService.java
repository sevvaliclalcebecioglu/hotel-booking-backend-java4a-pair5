package com.tobeto.hotel_booking_java4a_pair5.services.abstracts;


import com.tobeto.hotel_booking_java4a_pair5.core.result.DataResult;
import com.tobeto.hotel_booking_java4a_pair5.core.result.Result;
import com.tobeto.hotel_booking_java4a_pair5.entities.Booking;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.requests.booking.AddBookingRequest;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.requests.booking.UpdateBookingRequest;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.responses.booking.GetAllBookingResponse;
import com.tobeto.hotel_booking_java4a_pair5.services.dtos.responses.booking.GetByIdBookingResponse;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    Result add(AddBookingRequest request);

    Result update(UpdateBookingRequest request);

    Result delete(Integer id);

    DataResult<List<GetAllBookingResponse>> getAll();

    DataResult<GetByIdBookingResponse> getById(Integer id);

    DataResult<List<GetAllBookingResponse>> searchByDate(LocalDate startDate, LocalDate endDate);

    DataResult<List<GetAllBookingResponse>> searchByRoomType(Integer roomTypeId);

    Result changeCheckInDate(Integer id);

    Result changeCheckOutDate(Integer id);

    Result changeReservationStatus(Integer id, boolean isConfirmed);
}
