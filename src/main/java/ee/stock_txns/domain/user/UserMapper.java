package ee.stock_txns.domain.user;

import ee.stock_txns.business.dto.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {


    LoginResponse toLoginResponse(User user);

}
