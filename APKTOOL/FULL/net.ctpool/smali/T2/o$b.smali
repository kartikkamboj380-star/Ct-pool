.class public final enum LT2/o$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum n:LT2/o$b;

.field public static final enum o:LT2/o$b;

.field private static final synthetic p:[LT2/o$b;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LT2/o$b;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LT2/o$b;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LT2/o$b;->n:LT2/o$b;

    .line 10
    .line 11
    new-instance v1, LT2/o$b;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, 0x17

    .line 15
    .line 16
    const-string v4, "ANDROID_FIREBASE"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, LT2/o$b;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, LT2/o$b;->o:LT2/o$b;

    .line 22
    .line 23
    filled-new-array {v0, v1}, [LT2/o$b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LT2/o$b;->p:[LT2/o$b;

    .line 28
    .line 29
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LT2/o$b;->m:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LT2/o$b;
    .locals 1

    .line 1
    const-class v0, LT2/o$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LT2/o$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LT2/o$b;
    .locals 1

    .line 1
    sget-object v0, LT2/o$b;->p:[LT2/o$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [LT2/o$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LT2/o$b;

    .line 8
    .line 9
    return-object v0
.end method
