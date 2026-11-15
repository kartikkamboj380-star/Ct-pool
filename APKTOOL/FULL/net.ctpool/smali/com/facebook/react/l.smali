.class public Lcom/facebook/react/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/facebook/react/L;


# direct methods
.method public constructor <init>(Lcom/facebook/react/L;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/l;-><init>(Lcom/facebook/react/L;Lv2/a;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/L;Lv2/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/l;->a:Lcom/facebook/react/L;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 27

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Lv2/s;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lv2/s;-><init>(Lv2/a;)V

    new-instance v2, LA0/a;

    invoke-direct {v2}, LA0/a;-><init>()V

    new-instance v3, Lio/invertase/notifee/NotifeePackage;

    invoke-direct {v3}, Lio/invertase/notifee/NotifeePackage;-><init>()V

    new-instance v4, Lcom/reactnativecommunity/asyncstorage/i;

    invoke-direct {v4}, Lcom/reactnativecommunity/asyncstorage/i;-><init>()V

    new-instance v5, Lcom/reactnativecommunity/progressview/b;

    invoke-direct {v5}, Lcom/reactnativecommunity/progressview/b;-><init>()V

    new-instance v6, Lio/invertase/firebase/analytics/l;

    invoke-direct {v6}, Lio/invertase/firebase/analytics/l;-><init>()V

    new-instance v7, Lio/invertase/firebase/app/b;

    invoke-direct {v7}, Lio/invertase/firebase/app/b;-><init>()V

    new-instance v8, Lio/invertase/firebase/crashlytics/c;

    invoke-direct {v8}, Lio/invertase/firebase/crashlytics/c;-><init>()V

    new-instance v9, Lio/invertase/firebase/dynamiclinks/h;

    invoke-direct {v9}, Lio/invertase/firebase/dynamiclinks/h;-><init>()V

    new-instance v10, Lio/invertase/firebase/messaging/p;

    invoke-direct {v10}, Lio/invertase/firebase/messaging/p;-><init>()V

    new-instance v11, Lcom/reactnativegooglesignin/m;

    invoke-direct {v11}, Lcom/reactnativegooglesignin/m;-><init>()V

    new-instance v12, Lb5/a;

    invoke-direct {v12}, Lb5/a;-><init>()V

    new-instance v13, Le5/j;

    invoke-direct {v13}, Le5/j;-><init>()V

    new-instance v14, Lcom/learnium/RNDeviceInfo/b;

    invoke-direct {v14}, Lcom/learnium/RNDeviceInfo/b;-><init>()V

    new-instance v15, Lcom/dooboolab/rniap/o;

    invoke-direct {v15}, Lcom/dooboolab/rniap/o;-><init>()V

    new-instance v16, Lf5/k;

    invoke-direct/range {v16 .. v16}, Lf5/k;-><init>()V

    new-instance v17, Lcom/uerceg/play_install_referrer/a;

    invoke-direct/range {v17 .. v17}, Lcom/uerceg/play_install_referrer/a;-><init>()V

    new-instance v18, Lcom/th3rdwave/safeareacontext/e;

    invoke-direct/range {v18 .. v18}, Lcom/th3rdwave/safeareacontext/e;-><init>()V

    new-instance v19, Lcom/swmansion/rnscreens/k;

    invoke-direct/range {v19 .. v19}, Lcom/swmansion/rnscreens/k;-><init>()V

    new-instance v20, Ly0/c;

    invoke-direct/range {v20 .. v20}, Ly0/c;-><init>()V

    new-instance v21, Lcom/horcrux/svg/SvgPackage;

    invoke-direct/range {v21 .. v21}, Lcom/horcrux/svg/SvgPackage;-><init>()V

    new-instance v22, Lcom/tenjin/TenjinPackage;

    invoke-direct/range {v22 .. v22}, Lcom/tenjin/TenjinPackage;-><init>()V

    new-instance v23, LE0/a;

    invoke-direct/range {v23 .. v23}, LE0/a;-><init>()V

    new-instance v24, Lcom/reactnativecommunity/webview/n;

    invoke-direct/range {v24 .. v24}, Lcom/reactnativecommunity/webview/n;-><init>()V

    move-object/from16 v25, v0

    const/16 v0, 0x18

    new-array v0, v0, [Lcom/facebook/react/M;

    const/16 v26, 0x0

    aput-object v1, v0, v26

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v4, v0, v1

    const/4 v1, 0x4

    aput-object v5, v0, v1

    const/4 v1, 0x5

    aput-object v6, v0, v1

    const/4 v1, 0x6

    aput-object v7, v0, v1

    const/4 v1, 0x7

    aput-object v8, v0, v1

    const/16 v1, 0x8

    aput-object v9, v0, v1

    const/16 v1, 0x9

    aput-object v10, v0, v1

    const/16 v1, 0xa

    aput-object v11, v0, v1

    const/16 v1, 0xb

    aput-object v12, v0, v1

    const/16 v1, 0xc

    aput-object v13, v0, v1

    const/16 v1, 0xd

    aput-object v14, v0, v1

    const/16 v1, 0xe

    aput-object v15, v0, v1

    const/16 v1, 0xf

    aput-object v16, v0, v1

    const/16 v1, 0x10

    aput-object v17, v0, v1

    const/16 v1, 0x11

    aput-object v18, v0, v1

    const/16 v1, 0x12

    aput-object v19, v0, v1

    const/16 v1, 0x13

    aput-object v20, v0, v1

    const/16 v1, 0x14

    aput-object v21, v0, v1

    const/16 v1, 0x15

    aput-object v22, v0, v1

    const/16 v1, 0x16

    aput-object v23, v0, v1

    const/16 v1, 0x17

    aput-object v24, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method
