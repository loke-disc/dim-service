package dim_service.repository;

import dim_service.entity.Asset;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AssetRepository extends MongoRepository<Asset, String> {
    Optional<Asset> findByAssetId(String assetId);
}
