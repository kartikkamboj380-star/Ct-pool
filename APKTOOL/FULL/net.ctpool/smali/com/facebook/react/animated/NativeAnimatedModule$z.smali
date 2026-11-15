.class final enum Lcom/facebook/react/animated/NativeAnimatedModule$z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "z"
.end annotation


# static fields
.field public static final enum A:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum B:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum C:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum D:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum E:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum F:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum G:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum H:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field private static I:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field private static final synthetic J:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum n:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum o:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum p:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum q:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum r:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum s:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum t:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum u:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum v:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum w:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum x:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum y:Lcom/facebook/react/animated/NativeAnimatedModule$z;

.field public static final enum z:Lcom/facebook/react/animated/NativeAnimatedModule$z;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_CREATE_ANIMATED_NODE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->n:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->o:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_GET_VALUE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->p:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->q:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->r:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_CONNECT_ANIMATED_NODES"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->s:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_DISCONNECT_ANIMATED_NODES"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->t:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_START_ANIMATING_NODE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->u:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_STOP_ANIMATION"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->v:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_SET_ANIMATED_NODE_VALUE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->w:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_SET_ANIMATED_NODE_OFFSET"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->x:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->y:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET"

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->z:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->A:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW"

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->B:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_RESTORE_DEFAULT_VALUES"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->C:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_DROP_ANIMATED_NODE"

    const/16 v3, 0x11

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->D:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->E:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW"

    const/16 v3, 0x13

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->F:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_ADD_LISTENER"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->G:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    new-instance v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const-string v1, "OP_CODE_REMOVE_LISTENERS"

    const/16 v3, 0x15

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedModule$z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->H:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$z;->e()[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->J:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    const/4 v0, 0x0

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->I:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->m:I

    return-void
.end method

.method private static synthetic e()[Lcom/facebook/react/animated/NativeAnimatedModule$z;
    .locals 21

    .line 1
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->n:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v1, Lcom/facebook/react/animated/NativeAnimatedModule$z;->o:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$z;->p:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v3, Lcom/facebook/react/animated/NativeAnimatedModule$z;->q:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v4, Lcom/facebook/react/animated/NativeAnimatedModule$z;->r:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v5, Lcom/facebook/react/animated/NativeAnimatedModule$z;->s:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v6, Lcom/facebook/react/animated/NativeAnimatedModule$z;->t:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v7, Lcom/facebook/react/animated/NativeAnimatedModule$z;->u:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v8, Lcom/facebook/react/animated/NativeAnimatedModule$z;->v:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v9, Lcom/facebook/react/animated/NativeAnimatedModule$z;->w:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v10, Lcom/facebook/react/animated/NativeAnimatedModule$z;->x:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v11, Lcom/facebook/react/animated/NativeAnimatedModule$z;->y:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v12, Lcom/facebook/react/animated/NativeAnimatedModule$z;->z:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v13, Lcom/facebook/react/animated/NativeAnimatedModule$z;->A:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v14, Lcom/facebook/react/animated/NativeAnimatedModule$z;->B:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v15, Lcom/facebook/react/animated/NativeAnimatedModule$z;->C:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v16, Lcom/facebook/react/animated/NativeAnimatedModule$z;->D:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v17, Lcom/facebook/react/animated/NativeAnimatedModule$z;->E:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v18, Lcom/facebook/react/animated/NativeAnimatedModule$z;->F:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v19, Lcom/facebook/react/animated/NativeAnimatedModule$z;->G:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    sget-object v20, Lcom/facebook/react/animated/NativeAnimatedModule$z;->H:Lcom/facebook/react/animated/NativeAnimatedModule$z;

    filled-new-array/range {v0 .. v20}, [Lcom/facebook/react/animated/NativeAnimatedModule$z;

    move-result-object v0

    return-object v0
.end method

.method public static h(I)Lcom/facebook/react/animated/NativeAnimatedModule$z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->I:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$z;->values()[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->I:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    :cond_0
    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->I:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    add-int/lit8 p0, p0, -0x1

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/animated/NativeAnimatedModule$z;
    .locals 1

    const-class v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/animated/NativeAnimatedModule$z;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/animated/NativeAnimatedModule$z;
    .locals 1

    sget-object v0, Lcom/facebook/react/animated/NativeAnimatedModule$z;->J:[Lcom/facebook/react/animated/NativeAnimatedModule$z;

    invoke-virtual {v0}, [Lcom/facebook/react/animated/NativeAnimatedModule$z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/animated/NativeAnimatedModule$z;

    return-object v0
.end method
