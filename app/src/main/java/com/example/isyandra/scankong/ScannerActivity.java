package com.example.isyandra.scankong;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.isyandra.scankong.Scanner.BaseScannerActivity;

import butterknife.ButterKnife;

public class ScannerActivity extends BaseScannerActivity implements View.OnClickListener{

//    @BindView(R.id.entry_Number)
//    ImageView mEntryNumber;

    private Camera _camera;
    private Camera.Parameters parameters;
    private boolean isFlashOn= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        setupToolbar();

        ButterKnife.bind(this);

//        mEntryNumber.setOnClickListener(this);
    }

    public void getCamera(){
        if (_camera==null){
            try {
                _camera=Camera.open();
                parameters=_camera.getParameters();

            }
            catch (Exception ex){
                Toast.makeText(this,ex.toString(),Toast.LENGTH_LONG);
            }
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
//            case R.id.entry_Number:
//                intent = new Intent(this,EntrybikeidActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.flashlight:
//                if (view==mOnOfFlashLight){
//                    if (isFlashOn){
//                        turnOffFlash();
//                    }
//                    else{
//                        getCamera();
//                        turnOnFlash();
//                    }
//                }
//                break;
            default:
                break;
        }
    }

//    public void turnOnFlash(){
//        try{
//            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
//            _camera.setParameters(parameters);
//            _camera.startPreview();
//            isFlashOn=true;
//            mOnOfFlashLight.setImageResource(R.drawable.flashlight_turn_on);
//        }
//        catch (Exception ex){
//            Toast.makeText(this,ex.toString(),Toast.LENGTH_LONG).show();
//        }
//
//    }
//
//    public void turnOffFlash(){
//        try {
//            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
//            _camera.setParameters(parameters);
//            _camera.stopPreview();
//            isFlashOn=false;
//            mOnOfFlashLight.setImageResource(R.drawable.flashlight_turn_off);
//        }
//        catch (Exception ex){
//            Toast.makeText(this,ex.toString(),Toast.LENGTH_LONG).show();
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
        if (_camera!=null){
            _camera.release();
            _camera=null;
            parameters=null;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
