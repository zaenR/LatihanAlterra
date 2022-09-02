package com.alterra.apachePoi.services;

import com.alterra.apachePoi.dtos.CoinDto;
import com.alterra.apachePoi.entities.Coin;

import com.alterra.apachePoi.repositories.CoinRepo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.BeanIsAbstractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoinService implements ICoinService{
    public final static String excelFileType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CoinRepo coinRepo;
    @Override
    public List<Coin> upload(MultipartFile file) {
        if(!excelFileType.equals(file.getContentType())){
            throw new RuntimeException("Format file only excel (.xlsx)");
        }
        coinRepo.saveAll(convertExcelToDto(file));
        return convertExcelToDto(file);
    }

    private List<Coin> convertExcelToDto(MultipartFile file){
        List<Coin> coinList = new ArrayList<>();

        try (InputStream inputStream = file.getInputStream()){
            Workbook wb = new XSSFWorkbook(inputStream);
            Sheet sheet = wb.getSheet("schedule_coin_price_history (2)");

            Iterator<Row> it = sheet.iterator();
            it.next(); //skip header
            int i = 0;
            while(it.hasNext()){
                Coin coin = new Coin();
                Row row = it.next();
                Iterator<Cell> cellit = row.iterator();

                cekValidate(row);
                SimpleDateFormat sdf = new SimpleDateFormat("m/d/yyyy h:mm");
                while (cellit.hasNext()){
                    Cell cell = cellit.next();
                    String numVal = "";
                    switch(cell.getColumnIndex()){
                        case 0 :
                            coin.setId((long) cell.getNumericCellValue());
                            break;
                        case 1 :
                            coin.setName(cell.getStringCellValue());
                            break;
                        case 2 :
                            coin.setTicker(cell.getStringCellValue());
                            break;
                        case 3 :
                            coin.setCoinId((int) cell.getNumericCellValue());
                            break;
                        case 4 :
                            coin.setCode(cell.getStringCellValue());
                            break;
                        case 5 :
                            coin.setExchange(cell.getStringCellValue());
                            break;
                        case 6 :
                            coin.setInvalid((int) cell.getNumericCellValue());
                            break;
                        case 7 :
                            coin.setRecordTime((long) cell.getNumericCellValue());
                            break;
                        case 8 :
                            coin.setUsd((long) cell.getNumericCellValue());
                            break;
                        case 9 :
                            coin.setIdr((long)cell.getNumericCellValue());
                            break;
                        case 10 :
                            coin.setHnst((int) cell.getNumericCellValue());
                            break;
                        case 11 :
                            coin.setEth((long)(cell.getNumericCellValue()));
                            break;
                        case 12 :
                            coin.setBtc((long)(cell.getNumericCellValue()));
                            break;
                        case 13 :
                            coin.setCreateAt(cell.getDateCellValue());
                            break;
                        case 14 :
                            coin.setUpdateAt(cell.getDateCellValue());
                            break;
                        default:
                            break;
                    }
                }
                coinList.add(coin);
            }
            return coinList;
        } catch (IOException e){
            e.printStackTrace();
        }

        return coinList;
    }

    private void cekValidate(Row row){
        if (row.getCell(0).toString().isBlank()) {
            throw new RuntimeException("Id in row " +row.getRowNum()+ " is empty");
        } else if (row.getCell(1).toString().isBlank()){
            throw new RuntimeException("Name in row " +row.getRowNum()+ " is empty");
        } else if (row.getCell(2).toString().isBlank()){
            throw new RuntimeException("Ticker in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(3).toString().isBlank()){
            throw new RuntimeException("Coin id in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(4).toString().isBlank()){
            throw new RuntimeException("Code in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(5).toString().isBlank()){
            throw new RuntimeException("Exchange in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(6).toString().isBlank()){
            throw new RuntimeException("Invalid in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(7).toString().isBlank()){
            throw new RuntimeException("Record Time in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(8).toString().isBlank()){
            throw new RuntimeException("Usd in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(9).toString().isBlank()){
            throw new RuntimeException("Idr in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(10).toString().isBlank()){
            throw new RuntimeException("Hnst in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(11).toString().isBlank()){
            throw new RuntimeException("Eth in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(12).toString().isBlank()){
            throw new RuntimeException("Btc in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(13).toString().isBlank()){
            throw new RuntimeException("Created Date in row " +row.getCell(0).getRowIndex()+ " is empty");
        } else if (row.getCell(14).toString().isBlank()){
            throw new RuntimeException("Update Date in row " +row.getCell(0).getRowIndex()+ " is empty");
        }
    }

}
