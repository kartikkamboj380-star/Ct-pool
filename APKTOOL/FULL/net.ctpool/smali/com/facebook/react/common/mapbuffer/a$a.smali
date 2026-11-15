.class public final Lcom/facebook/react/common/mapbuffer/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/common/mapbuffer/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/facebook/react/common/mapbuffer/a$a;

.field private static final b:LC5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/react/common/mapbuffer/a$a;

    invoke-direct {v0}, Lcom/facebook/react/common/mapbuffer/a$a;-><init>()V

    sput-object v0, Lcom/facebook/react/common/mapbuffer/a$a;->a:Lcom/facebook/react/common/mapbuffer/a$a;

    new-instance v0, LC5/c;

    const/4 v1, 0x0

    const v2, 0xffff

    invoke-direct {v0, v1, v2}, LC5/c;-><init>(II)V

    sput-object v0, Lcom/facebook/react/common/mapbuffer/a$a;->b:LC5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LC5/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$a;->b:LC5/c;

    .line 2
    .line 3
    return-object v0
.end method
