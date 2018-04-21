package com.fpij.chpt4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AssetUtil {

    public static void main(String[] args) {
        List <Asset> assets = Arrays.asList( new Asset(Asset.AssetType.BOND, 2990),
                                new Asset(Asset.AssetType.BOND, 11345),
                                new Asset(Asset.AssetType.STOCK, 1000),
                                new Asset(Asset.AssetType.BOND, 990),
                                new Asset(Asset.AssetType.STOCK, 2000));

        System.out.println(totalAssetValue(assets, (final Asset asset) -> asset.getAssetType() == Asset.AssetType.STOCK ));

        System.out.println(totalAssetValue(assets, (final Asset asset) -> asset.getAssetType() == Asset.AssetType.BOND ));

    }

    public static int totalAssetValue (final List <Asset> assets, final Predicate<Asset> assetTypePicker) {

        return assets.stream()
                .filter(assetTypePicker)
                .mapToInt(asset -> asset.getAssetValue())
                .sum();

    }
}
