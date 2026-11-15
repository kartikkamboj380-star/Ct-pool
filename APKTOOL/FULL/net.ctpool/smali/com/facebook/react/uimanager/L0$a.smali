.class final Lcom/facebook/react/uimanager/L0$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/L0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Lcom/facebook/react/uimanager/L0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/L0$a;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/L0$a;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/L0$a;->m:Lcom/facebook/react/uimanager/L0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LS1/b;
    .locals 2

    .line 1
    new-instance v0, LS1/b;

    .line 2
    .line 3
    const/16 v1, 0x400

    .line 4
    .line 5
    invoke-direct {v0, v1}, LS1/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/L0$a;->a()LS1/b;

    move-result-object v0

    return-object v0
.end method
