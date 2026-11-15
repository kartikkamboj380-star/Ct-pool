.class public final enum LT2/w$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum A:LT2/w$c;

.field public static final enum B:LT2/w$c;

.field public static final enum C:LT2/w$c;

.field public static final enum D:LT2/w$c;

.field public static final enum E:LT2/w$c;

.field public static final enum F:LT2/w$c;

.field private static final G:Landroid/util/SparseArray;

.field private static final synthetic H:[LT2/w$c;

.field public static final enum n:LT2/w$c;

.field public static final enum o:LT2/w$c;

.field public static final enum p:LT2/w$c;

.field public static final enum q:LT2/w$c;

.field public static final enum r:LT2/w$c;

.field public static final enum s:LT2/w$c;

.field public static final enum t:LT2/w$c;

.field public static final enum u:LT2/w$c;

.field public static final enum v:LT2/w$c;

.field public static final enum w:LT2/w$c;

.field public static final enum x:LT2/w$c;

.field public static final enum y:LT2/w$c;

.field public static final enum z:LT2/w$c;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 56

    .line 1
    new-instance v15, LT2/w$c;

    move-object v0, v15

    const-string v1, "MOBILE"

    const/4 v14, 0x0

    invoke-direct {v15, v1, v14, v14}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v15, LT2/w$c;->n:LT2/w$c;

    new-instance v13, LT2/w$c;

    move-object v1, v13

    const-string v2, "WIFI"

    const/4 v12, 0x1

    invoke-direct {v13, v2, v12, v12}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v13, LT2/w$c;->o:LT2/w$c;

    new-instance v11, LT2/w$c;

    move-object v2, v11

    const-string v3, "MOBILE_MMS"

    const/4 v10, 0x2

    invoke-direct {v11, v3, v10, v10}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v11, LT2/w$c;->p:LT2/w$c;

    new-instance v9, LT2/w$c;

    move-object v3, v9

    const-string v4, "MOBILE_SUPL"

    const/4 v8, 0x3

    invoke-direct {v9, v4, v8, v8}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, LT2/w$c;->q:LT2/w$c;

    new-instance v7, LT2/w$c;

    move-object v4, v7

    const-string v5, "MOBILE_DUN"

    const/4 v6, 0x4

    invoke-direct {v7, v5, v6, v6}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, LT2/w$c;->r:LT2/w$c;

    new-instance v5, LT2/w$c;

    move-object/from16 v19, v5

    const-string v6, "MOBILE_HIPRI"

    move-object/from16 v20, v0

    const/4 v0, 0x5

    move-object/from16 v21, v1

    move-object/from16 v1, v19

    invoke-direct {v1, v6, v0, v0}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LT2/w$c;->s:LT2/w$c;

    new-instance v6, LT2/w$c;

    move-object/from16 v19, v6

    const-string v0, "WIMAX"

    move-object/from16 v22, v1

    const/4 v1, 0x6

    move-object/from16 v23, v2

    move-object/from16 v2, v19

    invoke-direct {v2, v0, v1, v1}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LT2/w$c;->t:LT2/w$c;

    new-instance v0, LT2/w$c;

    move-object/from16 v24, v7

    move-object v7, v0

    const-string v1, "BLUETOOTH"

    move-object/from16 v25, v2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT2/w$c;->u:LT2/w$c;

    new-instance v1, LT2/w$c;

    move-object v8, v1

    const-string v2, "DUMMY"

    move-object/from16 v26, v0

    const/16 v0, 0x8

    invoke-direct {v1, v2, v0, v0}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LT2/w$c;->v:LT2/w$c;

    new-instance v2, LT2/w$c;

    move-object/from16 v27, v9

    move-object v9, v2

    const-string v0, "ETHERNET"

    move-object/from16 v28, v1

    const/16 v1, 0x9

    invoke-direct {v2, v0, v1, v1}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LT2/w$c;->w:LT2/w$c;

    new-instance v0, LT2/w$c;

    move-object v10, v0

    const-string v1, "MOBILE_FOTA"

    move-object/from16 v29, v2

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT2/w$c;->x:LT2/w$c;

    new-instance v1, LT2/w$c;

    move-object/from16 v30, v11

    move-object v11, v1

    const-string v2, "MOBILE_IMS"

    move-object/from16 v31, v0

    const/16 v0, 0xb

    invoke-direct {v1, v2, v0, v0}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LT2/w$c;->y:LT2/w$c;

    new-instance v2, LT2/w$c;

    move-object v12, v2

    const-string v0, "MOBILE_CBS"

    move-object/from16 v32, v1

    const/16 v1, 0xc

    invoke-direct {v2, v0, v1, v1}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LT2/w$c;->z:LT2/w$c;

    new-instance v0, LT2/w$c;

    move-object/from16 v33, v13

    move-object v13, v0

    const-string v1, "WIFI_P2P"

    move-object/from16 v34, v2

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v2}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT2/w$c;->A:LT2/w$c;

    new-instance v1, LT2/w$c;

    move-object v14, v1

    const-string v2, "MOBILE_IA"

    move-object/from16 v35, v0

    const/16 v0, 0xe

    invoke-direct {v1, v2, v0, v0}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LT2/w$c;->B:LT2/w$c;

    new-instance v2, LT2/w$c;

    move-object/from16 v36, v15

    move-object v15, v2

    const-string v0, "MOBILE_EMERGENCY"

    move-object/from16 v37, v1

    const/16 v1, 0xf

    invoke-direct {v2, v0, v1, v1}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LT2/w$c;->C:LT2/w$c;

    new-instance v0, LT2/w$c;

    move-object/from16 v16, v0

    const-string v1, "PROXY"

    move-object/from16 v38, v2

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2, v2}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, LT2/w$c;->D:LT2/w$c;

    new-instance v1, LT2/w$c;

    move-object/from16 v17, v1

    const-string v2, "VPN"

    move-object/from16 v39, v0

    const/16 v0, 0x11

    invoke-direct {v1, v2, v0, v0}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, LT2/w$c;->E:LT2/w$c;

    new-instance v2, LT2/w$c;

    move-object/from16 v18, v2

    const-string v0, "NONE"

    move-object/from16 v40, v1

    const/16 v1, 0x12

    move-object/from16 v41, v3

    const/4 v3, -0x1

    invoke-direct {v2, v0, v1, v3}, LT2/w$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, LT2/w$c;->F:LT2/w$c;

    move-object/from16 v55, v2

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v42, v22

    move-object/from16 v2, v23

    move-object/from16 v43, v25

    move-object/from16 v44, v26

    move-object/from16 v45, v28

    move-object/from16 v46, v29

    move-object/from16 v47, v31

    move-object/from16 v48, v32

    move-object/from16 v49, v34

    move-object/from16 v50, v35

    move-object/from16 v51, v37

    move-object/from16 v52, v38

    move-object/from16 v53, v39

    move-object/from16 v54, v40

    move-object/from16 v3, v41

    filled-new-array/range {v0 .. v18}, [LT2/w$c;

    move-result-object v0

    sput-object v0, LT2/w$c;->H:[LT2/w$c;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, LT2/w$c;->G:Landroid/util/SparseArray;

    move-object/from16 v1, v36

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v33

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v30

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v27

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v24

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v42

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v43

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v44

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v45

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v46

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v47

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v48

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v49

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v50

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v51

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v52

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v53

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v54

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v55

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LT2/w$c;->m:I

    .line 5
    .line 6
    return-void
.end method

.method public static e(I)LT2/w$c;
    .locals 1

    .line 1
    sget-object v0, LT2/w$c;->G:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LT2/w$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LT2/w$c;
    .locals 1

    .line 1
    const-class v0, LT2/w$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LT2/w$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LT2/w$c;
    .locals 1

    .line 1
    sget-object v0, LT2/w$c;->H:[LT2/w$c;

    .line 2
    .line 3
    invoke-virtual {v0}, [LT2/w$c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LT2/w$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, LT2/w$c;->m:I

    .line 2
    .line 3
    return v0
.end method
