.class public final Lcom/facebook/react/devsupport/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/F;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/e$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/react/devsupport/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/devsupport/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/devsupport/e;->a:Lcom/facebook/react/devsupport/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/facebook/react/devsupport/a0;Ljava/lang/String;ZLX1/i;LX1/b;ILjava/util/Map;LS1/j;LX1/c;LX1/h;)LX1/e;
    .locals 23

    move-object/from16 v11, p1

    .line 1
    const-string v0, "applicationContext"

    invoke-static {v11, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactInstanceManagerHelper"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    new-instance v0, Lcom/facebook/react/devsupport/f0;

    invoke-direct {v0}, Lcom/facebook/react/devsupport/f0;-><init>()V

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "com.facebook.react.devsupport"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "BridgeDevSupportManager"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v12, Landroid/content/Context;

    const-class v13, Lcom/facebook/react/devsupport/a0;

    const-class v14, Ljava/lang/String;

    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v16, LX1/i;

    const-class v17, LX1/b;

    sget-object v18, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v19, Ljava/util/Map;

    const-class v20, LS1/j;

    const-class v21, LX1/c;

    const-class v22, LX1/h;

    filled-new-array/range {v12 .. v22}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    filled-new-array/range {v0 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LX1/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lcom/facebook/react/devsupport/Z;

    invoke-direct {v0, v11}, Lcom/facebook/react/devsupport/Z;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0
.end method
