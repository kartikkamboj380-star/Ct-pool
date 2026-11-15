.class Lu4/g$b;
.super Lu4/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lz3/m;


# direct methods
.method constructor <init>(Lz3/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu4/g$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/g$b;->a:Lz3/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public h0(Lcom/google/android/gms/common/api/Status;Lu4/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/g$b;->a:Lz3/m;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/common/api/internal/TaskUtil;->setResultOrApiException(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lz3/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
