package javasys.cake.logic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javasys.cake.common.CakeBusinessException;
import javasys.cake.common.CakeSystemException;
import javasys.cake.dao.ConnectionManager;
import javasys.cake.dao.ItemDAO;
import javasys.cake.entity.Item;

public class ItemFindAllLogic {

    public ArrayList<Item> findAllItem(String itemCode) throws CakeBusinessException {

        Connection con = null;
        ArrayList<Item> itemList = new ArrayList<Item>();

        try {
            //データベースの接続を取得する
            con = ConnectionManager.getConnection();
            ItemDAO itemDAO = new ItemDAO(con);
            itemList = itemDAO.findAllItemByCode(itemCode);

            //検索結果がない場合、業務エラーを発生させる
            if (itemList == null || itemList.size() == 0) {
                throw new CakeBusinessException("商品リストが存在しません");
            }
        } catch (SQLException e) {
            //データベースエラーの場合、システムエラー発生させる
            throw new CakeSystemException("システムエラーが発生しました。管理者に連絡してください", e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                throw new CakeSystemException("システムエラーが発生しました。管理者に連絡してください", e);
            }
        }
        return itemList;
    }
}