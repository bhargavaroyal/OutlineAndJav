package com.bhargavaroyal.outlineandjav.Service.aidl.client;

public class AidlClientActivity/* extends AppCompatActivity*/ {
    /*
    public static final String TAG = "MainClient";
    private IMyAidlInterface iMyAidlInterface;
    private ServiceConnection servicecon = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            Log.d(TAG, "onServiceConnected() called with: componentName = [" + componentName + "], service = [" + service + "]");
            iMyAidlInterface = IMyAidlInterface.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(TAG, "onServiceDisconnected() called with: componentName = [" + componentName + "]");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_bind).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.server.Aidl");
                bindService(intent, servicecon, BIND_AUTO_CREATE);
            }
        });
        findViewById(R.id.btn_cal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(TAG, "onClick() called with: view " + iMyAidlInterface.calculate(10,100));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static Intent convertImplicitIntentToExplicitIntent(Intent implicitIntent, Context context) {
        PackageManager pm = context.getPackageManager();
        List<ResolveInfo> resolveInfoList = pm.queryIntentServices(implicitIntent, 0);

        if (resolveInfoList == null || resolveInfoList.size() != 1) {
            return null;
        }
        ResolveInfo serviceInfo = resolveInfoList.get(0);
        ComponentName component = new ComponentName(serviceInfo.serviceInfo.packageName, serviceInfo.serviceInfo.name);
        Intent explicitIntent = new Intent(implicitIntent);
        explicitIntent.setComponent(component);
        return explicitIntent;
    }
*/
}